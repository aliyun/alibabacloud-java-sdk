// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetLeadsListPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetLeadsListPageResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetLeadsListPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLeadsListPageResponseBody self = new GetLeadsListPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLeadsListPageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLeadsListPageResponseBody setData(GetLeadsListPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLeadsListPageResponseBodyData getData() {
        return this.data;
    }

    public GetLeadsListPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLeadsListPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLeadsListPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLeadsListPageResponseBodyDataList extends TeaModel {
        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ContentId")
        public Long contentId;

        @NameInMap("CreativeId")
        public Integer creativeId;

        @NameInMap("CreativeName")
        public String creativeName;

        @NameInMap("LeadsDetail")
        public String leadsDetail;

        @NameInMap("SerialId")
        public Long serialId;

        @NameInMap("TaskId")
        public Long taskId;

        public static GetLeadsListPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetLeadsListPageResponseBodyDataList self = new GetLeadsListPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetLeadsListPageResponseBodyDataList setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public GetLeadsListPageResponseBodyDataList setContentId(Long contentId) {
            this.contentId = contentId;
            return this;
        }
        public Long getContentId() {
            return this.contentId;
        }

        public GetLeadsListPageResponseBodyDataList setCreativeId(Integer creativeId) {
            this.creativeId = creativeId;
            return this;
        }
        public Integer getCreativeId() {
            return this.creativeId;
        }

        public GetLeadsListPageResponseBodyDataList setCreativeName(String creativeName) {
            this.creativeName = creativeName;
            return this;
        }
        public String getCreativeName() {
            return this.creativeName;
        }

        public GetLeadsListPageResponseBodyDataList setLeadsDetail(String leadsDetail) {
            this.leadsDetail = leadsDetail;
            return this;
        }
        public String getLeadsDetail() {
            return this.leadsDetail;
        }

        public GetLeadsListPageResponseBodyDataList setSerialId(Long serialId) {
            this.serialId = serialId;
            return this;
        }
        public Long getSerialId() {
            return this.serialId;
        }

        public GetLeadsListPageResponseBodyDataList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class GetLeadsListPageResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        public static GetLeadsListPageResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLeadsListPageResponseBodyDataPageInfo self = new GetLeadsListPageResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public GetLeadsListPageResponseBodyDataPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetLeadsListPageResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetLeadsListPageResponseBodyDataPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

    public static class GetLeadsListPageResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetLeadsListPageResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public GetLeadsListPageResponseBodyDataPageInfo pageInfo;

        public static GetLeadsListPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLeadsListPageResponseBodyData self = new GetLeadsListPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLeadsListPageResponseBodyData setList(java.util.List<GetLeadsListPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetLeadsListPageResponseBodyDataList> getList() {
            return this.list;
        }

        public GetLeadsListPageResponseBodyData setPageInfo(GetLeadsListPageResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public GetLeadsListPageResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
