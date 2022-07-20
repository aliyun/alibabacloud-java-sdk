// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetResourcePublicIPsResponseBody extends TeaModel {
    // ip 列表
    @NameInMap("IpList")
    public java.util.List<GetResourcePublicIPsResponseBodyIpList> ipList;

    // 第几页
    @NameInMap("PageNum")
    public Integer pageNum;

    // 每页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // pop的requestId
    @NameInMap("RequestId")
    public String requestId;

    // 满足匹配条件的总量
    @NameInMap("Total")
    public Integer total;

    public static GetResourcePublicIPsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePublicIPsResponseBody self = new GetResourcePublicIPsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourcePublicIPsResponseBody setIpList(java.util.List<GetResourcePublicIPsResponseBodyIpList> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<GetResourcePublicIPsResponseBodyIpList> getIpList() {
        return this.ipList;
    }

    public GetResourcePublicIPsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetResourcePublicIPsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetResourcePublicIPsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourcePublicIPsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetResourcePublicIPsResponseBodyIpList extends TeaModel {
        // ip
        @NameInMap("Ip")
        public String ip;

        // 项目 id
        @NameInMap("ProjectId")
        public String projectId;

        public static GetResourcePublicIPsResponseBodyIpList build(java.util.Map<String, ?> map) throws Exception {
            GetResourcePublicIPsResponseBodyIpList self = new GetResourcePublicIPsResponseBodyIpList();
            return TeaModel.build(map, self);
        }

        public GetResourcePublicIPsResponseBodyIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetResourcePublicIPsResponseBodyIpList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
