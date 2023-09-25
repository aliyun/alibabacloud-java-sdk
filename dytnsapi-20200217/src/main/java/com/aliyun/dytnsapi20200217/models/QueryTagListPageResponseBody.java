// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTagListPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTagListPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTagListPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagListPageResponseBody self = new QueryTagListPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagListPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTagListPageResponseBody setData(QueryTagListPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTagListPageResponseBodyData getData() {
        return this.data;
    }

    public QueryTagListPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTagListPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagListPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTagListPageResponseBodyDataRecords extends TeaModel {
        /**
         * <p>前端调用的api名称</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>code</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>API文档链接</p>
         */
        @NameInMap("DocAddress")
        public String docAddress;

        /**
         * <p>标签 id</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>行业id</p>
         */
        @NameInMap("IndustryId")
        public Long industryId;

        /**
         * <p>行业名称</p>
         */
        @NameInMap("IndustryName")
        public String industryName;

        /**
         * <p>标签介绍</p>
         */
        @NameInMap("Introduction")
        public String introduction;

        /**
         * <p>是否已经申请开通</p>
         */
        @NameInMap("IsOpen")
        public Long isOpen;

        /**
         * <p>标签名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>0 隐藏 1 公开</p>
         */
        @NameInMap("SaleStatusStr")
        public String saleStatusStr;

        /**
         * <p>场景id</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>场景名称</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        public static QueryTagListPageResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryTagListPageResponseBodyDataRecords self = new QueryTagListPageResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public QueryTagListPageResponseBodyDataRecords setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public QueryTagListPageResponseBodyDataRecords setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryTagListPageResponseBodyDataRecords setDocAddress(String docAddress) {
            this.docAddress = docAddress;
            return this;
        }
        public String getDocAddress() {
            return this.docAddress;
        }

        public QueryTagListPageResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTagListPageResponseBodyDataRecords setIndustryId(Long industryId) {
            this.industryId = industryId;
            return this;
        }
        public Long getIndustryId() {
            return this.industryId;
        }

        public QueryTagListPageResponseBodyDataRecords setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public QueryTagListPageResponseBodyDataRecords setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public QueryTagListPageResponseBodyDataRecords setIsOpen(Long isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Long getIsOpen() {
            return this.isOpen;
        }

        public QueryTagListPageResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTagListPageResponseBodyDataRecords setSaleStatusStr(String saleStatusStr) {
            this.saleStatusStr = saleStatusStr;
            return this;
        }
        public String getSaleStatusStr() {
            return this.saleStatusStr;
        }

        public QueryTagListPageResponseBodyDataRecords setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public QueryTagListPageResponseBodyDataRecords setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

    public static class QueryTagListPageResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<QueryTagListPageResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static QueryTagListPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTagListPageResponseBodyData self = new QueryTagListPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTagListPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryTagListPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryTagListPageResponseBodyData setRecords(java.util.List<QueryTagListPageResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryTagListPageResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public QueryTagListPageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryTagListPageResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
