// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetConsumerListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The consumer groups.</p>
     */
    @NameInMap("ConsumerList")
    public GetConsumerListResponseBodyConsumerList consumerList;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Long total;

    public static GetConsumerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerListResponseBody self = new GetConsumerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetConsumerListResponseBody setConsumerList(GetConsumerListResponseBodyConsumerList consumerList) {
        this.consumerList = consumerList;
        return this;
    }
    public GetConsumerListResponseBodyConsumerList getConsumerList() {
        return this.consumerList;
    }

    public GetConsumerListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetConsumerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetConsumerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetConsumerListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO self = new GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConsumerListResponseBodyConsumerListConsumerVOTags extends TeaModel {
        @NameInMap("TagVO")
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO> tagVO;

        public static GetConsumerListResponseBodyConsumerListConsumerVOTags build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerListConsumerVOTags self = new GetConsumerListResponseBodyConsumerListConsumerVOTags();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerListConsumerVOTags setTagVO(java.util.List<GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO> tagVO) {
            this.tagVO = tagVO;
            return this;
        }
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVOTagsTagVO> getTagVO() {
            return this.tagVO;
        }

    }

    public static class GetConsumerListResponseBodyConsumerListConsumerVO extends TeaModel {
        /**
         * <p>Indicates that the consumer group was automatically created by the system.</p>
         */
        @NameInMap("AutomaticallyCreatedGroup")
        public Boolean automaticallyCreatedGroup;

        /**
         * <p>The consumer group ID.</p>
         */
        @NameInMap("ConsumerId")
        public String consumerId;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the region where the instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance description.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public GetConsumerListResponseBodyConsumerListConsumerVOTags tags;

        public static GetConsumerListResponseBodyConsumerListConsumerVO build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerListConsumerVO self = new GetConsumerListResponseBodyConsumerListConsumerVO();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setAutomaticallyCreatedGroup(Boolean automaticallyCreatedGroup) {
            this.automaticallyCreatedGroup = automaticallyCreatedGroup;
            return this;
        }
        public Boolean getAutomaticallyCreatedGroup() {
            return this.automaticallyCreatedGroup;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetConsumerListResponseBodyConsumerListConsumerVO setTags(GetConsumerListResponseBodyConsumerListConsumerVOTags tags) {
            this.tags = tags;
            return this;
        }
        public GetConsumerListResponseBodyConsumerListConsumerVOTags getTags() {
            return this.tags;
        }

    }

    public static class GetConsumerListResponseBodyConsumerList extends TeaModel {
        @NameInMap("ConsumerVO")
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVO> consumerVO;

        public static GetConsumerListResponseBodyConsumerList build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerListResponseBodyConsumerList self = new GetConsumerListResponseBodyConsumerList();
            return TeaModel.build(map, self);
        }

        public GetConsumerListResponseBodyConsumerList setConsumerVO(java.util.List<GetConsumerListResponseBodyConsumerListConsumerVO> consumerVO) {
            this.consumerVO = consumerVO;
            return this;
        }
        public java.util.List<GetConsumerListResponseBodyConsumerListConsumerVO> getConsumerVO() {
            return this.consumerVO;
        }

    }

}
