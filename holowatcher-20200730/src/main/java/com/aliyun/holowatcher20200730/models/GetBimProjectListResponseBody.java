// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectListResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimProjectListResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectListResponseBody self = new GetBimProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimProjectListResponseBody setDatas(GetBimProjectListResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimProjectListResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimProjectListResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimProjectListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimProjectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimProjectListResponseBodyDatasList extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 项目id
        @NameInMap("Id")
        public Long id;

        // 模型构建状态
        @NameInMap("ModelingStatus")
        public Long modelingStatus;

        // 项目名
        @NameInMap("Name")
        public String name;

        // 当前阶段
        @NameInMap("Phase")
        public String phase;

        // 备注
        @NameInMap("Remarks")
        public String remarks;

        // 是否可以渲染3d；1是0否
        @NameInMap("Renderable")
        public Long renderable;

        // 当前项目状态
        @NameInMap("Status")
        public Long status;

        // 租户id
        @NameInMap("TenantId")
        public Long tenantId;

        // 图纸转换状态
        @NameInMap("TransStatus")
        public Long transStatus;

        // 类型
        @NameInMap("Type")
        public String type;

        // 修改时间
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetBimProjectListResponseBodyDatasList build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectListResponseBodyDatasList self = new GetBimProjectListResponseBodyDatasList();
            return TeaModel.build(map, self);
        }

        public GetBimProjectListResponseBodyDatasList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBimProjectListResponseBodyDatasList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimProjectListResponseBodyDatasList setModelingStatus(Long modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public Long getModelingStatus() {
            return this.modelingStatus;
        }

        public GetBimProjectListResponseBodyDatasList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBimProjectListResponseBodyDatasList setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetBimProjectListResponseBodyDatasList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetBimProjectListResponseBodyDatasList setRenderable(Long renderable) {
            this.renderable = renderable;
            return this;
        }
        public Long getRenderable() {
            return this.renderable;
        }

        public GetBimProjectListResponseBodyDatasList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetBimProjectListResponseBodyDatasList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetBimProjectListResponseBodyDatasList setTransStatus(Long transStatus) {
            this.transStatus = transStatus;
            return this;
        }
        public Long getTransStatus() {
            return this.transStatus;
        }

        public GetBimProjectListResponseBodyDatasList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetBimProjectListResponseBodyDatasList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetBimProjectListResponseBodyDatas extends TeaModel {
        // 总条数
        @NameInMap("Count")
        public Long count;

        // 返回数据集合
        @NameInMap("List")
        public java.util.List<GetBimProjectListResponseBodyDatasList> list;

        // 当前页
        @NameInMap("PageNum")
        public Long pageNum;

        // 每页大小
        @NameInMap("PageSize")
        public Long pageSize;

        // 总共多少页
        @NameInMap("Pages")
        public Long pages;

        public static GetBimProjectListResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectListResponseBodyDatas self = new GetBimProjectListResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimProjectListResponseBodyDatas setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetBimProjectListResponseBodyDatas setList(java.util.List<GetBimProjectListResponseBodyDatasList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetBimProjectListResponseBodyDatasList> getList() {
            return this.list;
        }

        public GetBimProjectListResponseBodyDatas setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetBimProjectListResponseBodyDatas setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetBimProjectListResponseBodyDatas setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

    }

}
