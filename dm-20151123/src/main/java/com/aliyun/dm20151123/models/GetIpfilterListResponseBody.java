// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetIpfilterListResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public GetIpfilterListResponseBodyData data;

    public static GetIpfilterListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpfilterListResponseBody self = new GetIpfilterListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpfilterListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetIpfilterListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetIpfilterListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpfilterListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetIpfilterListResponseBody setData(GetIpfilterListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIpfilterListResponseBodyData getData() {
        return this.data;
    }

    public static class GetIpfilterListResponseBodyDataIpfilters extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("IpAddress")
        public String ipAddress;

        public static GetIpfilterListResponseBodyDataIpfilters build(java.util.Map<String, ?> map) throws Exception {
            GetIpfilterListResponseBodyDataIpfilters self = new GetIpfilterListResponseBodyDataIpfilters();
            return TeaModel.build(map, self);
        }

        public GetIpfilterListResponseBodyDataIpfilters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetIpfilterListResponseBodyDataIpfilters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetIpfilterListResponseBodyDataIpfilters setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class GetIpfilterListResponseBodyData extends TeaModel {
        @NameInMap("ipfilters")
        public java.util.List<GetIpfilterListResponseBodyDataIpfilters> ipfilters;

        public static GetIpfilterListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIpfilterListResponseBodyData self = new GetIpfilterListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIpfilterListResponseBodyData setIpfilters(java.util.List<GetIpfilterListResponseBodyDataIpfilters> ipfilters) {
            this.ipfilters = ipfilters;
            return this;
        }
        public java.util.List<GetIpfilterListResponseBodyDataIpfilters> getIpfilters() {
            return this.ipfilters;
        }

    }

}
