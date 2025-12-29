// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListServiceInstanceForPageResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>状态码，OK表示响应成功</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>响应消息</p>
     * 
     * <strong>example:</strong>
     * <p>每页最大100条！</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ListServiceInstanceForPageResponseBodyModel model;

    /**
     * <p>请求唯一id</p>
     * 
     * <strong>example:</strong>
     * <p>ED18A5AE-9BBC-5851-1111-8E5B8C23CEDE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListServiceInstanceForPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceForPageResponseBody self = new ListServiceInstanceForPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceForPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListServiceInstanceForPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServiceInstanceForPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceInstanceForPageResponseBody setModel(ListServiceInstanceForPageResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ListServiceInstanceForPageResponseBodyModel getModel() {
        return this.model;
    }

    public ListServiceInstanceForPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstanceForPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServiceInstanceForPageResponseBodyModelRecords extends TeaModel {
        /**
         * <p>aliUid</p>
         * 
         * <strong>example:</strong>
         * <p>11******123</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>服务实例号</p>
         * 
         * <strong>example:</strong>
         * <p>0571****1234</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>创建时间（时间戳）</p>
         * 
         * <strong>example:</strong>
         * <p>1759109856000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>实例状态（init：初始化；usable：可用；unusable：不可用；destory：注销）</p>
         * 
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>服务实例名称</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>关联可用数量</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RelationAvailableCount")
        public Long relationAvailableCount;

        /**
         * <p>关联总数量</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("RelationTotalCount")
        public Long relationTotalCount;

        /**
         * <p>场景ID</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>场景名称</p>
         * 
         * <strong>example:</strong>
         * <p>系统通知</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>绑定状态：绑定；未绑定</p>
         * 
         * <strong>example:</strong>
         * <p>绑定</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>用途ID</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("UsageId")
        public Long usageId;

        /**
         * <p>用途名称</p>
         * 
         * <strong>example:</strong>
         * <p>语音通知</p>
         */
        @NameInMap("UsageName")
        public String usageName;

        public static ListServiceInstanceForPageResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceForPageResponseBodyModelRecords self = new ListServiceInstanceForPageResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setRelationAvailableCount(Long relationAvailableCount) {
            this.relationAvailableCount = relationAvailableCount;
            return this;
        }
        public Long getRelationAvailableCount() {
            return this.relationAvailableCount;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setRelationTotalCount(Long relationTotalCount) {
            this.relationTotalCount = relationTotalCount;
            return this;
        }
        public Long getRelationTotalCount() {
            return this.relationTotalCount;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setUsageId(Long usageId) {
            this.usageId = usageId;
            return this;
        }
        public Long getUsageId() {
            return this.usageId;
        }

        public ListServiceInstanceForPageResponseBodyModelRecords setUsageName(String usageName) {
            this.usageName = usageName;
            return this;
        }
        public String getUsageName() {
            return this.usageName;
        }

    }

    public static class ListServiceInstanceForPageResponseBodyModel extends TeaModel {
        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<ListServiceInstanceForPageResponseBodyModelRecords> records;

        /**
         * <p>总数</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>总页数</p>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        @NameInMap("TotalPage")
        public Long totalPage;

        public static ListServiceInstanceForPageResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceForPageResponseBodyModel self = new ListServiceInstanceForPageResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceForPageResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public ListServiceInstanceForPageResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListServiceInstanceForPageResponseBodyModel setRecords(java.util.List<ListServiceInstanceForPageResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListServiceInstanceForPageResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public ListServiceInstanceForPageResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListServiceInstanceForPageResponseBodyModel setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
