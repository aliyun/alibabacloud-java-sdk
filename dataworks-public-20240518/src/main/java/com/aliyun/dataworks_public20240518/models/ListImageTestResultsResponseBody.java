// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageTestResultsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListImageTestResultsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImageTestResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageTestResultsResponseBody self = new ListImageTestResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageTestResultsResponseBody setPagingInfo(ListImageTestResultsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListImageTestResultsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListImageTestResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageTestResultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListImageTestResultsResponseBodyPagingInfoTestResultList extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>img_123456</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The test result message.</p>
         * 
         * <strong>example:</strong>
         * <p>test finished</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The operation time, represented as a 64-bit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1727055811000</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111-1111-1111-1111-111111111111</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The publish stage of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>UNPUBLISHED</p>
         */
        @NameInMap("PublishStage")
        public String publishStage;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The status of the test process.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListImageTestResultsResponseBodyPagingInfoTestResultList build(java.util.Map<String, ?> map) throws Exception {
            ListImageTestResultsResponseBodyPagingInfoTestResultList self = new ListImageTestResultsResponseBodyPagingInfoTestResultList();
            return TeaModel.build(map, self);
        }

        public ListImageTestResultsResponseBodyPagingInfoTestResultList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImageTestResultsResponseBodyPagingInfoTestResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListImageTestResultsResponseBodyPagingInfoTestResultList setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public ListImageTestResultsResponseBodyPagingInfoTestResultList setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListImageTestResultsResponseBodyPagingInfoTestResultList setPublishStage(String publishStage) {
            this.publishStage = publishStage;
            return this;
        }
        public String getPublishStage() {
            return this.publishStage;
        }

        public ListImageTestResultsResponseBodyPagingInfoTestResultList setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListImageTestResultsResponseBodyPagingInfoTestResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListImageTestResultsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of image test results.</p>
         */
        @NameInMap("TestResultList")
        public java.util.List<ListImageTestResultsResponseBodyPagingInfoTestResultList> testResultList;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListImageTestResultsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListImageTestResultsResponseBodyPagingInfo self = new ListImageTestResultsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListImageTestResultsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListImageTestResultsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListImageTestResultsResponseBodyPagingInfo setTestResultList(java.util.List<ListImageTestResultsResponseBodyPagingInfoTestResultList> testResultList) {
            this.testResultList = testResultList;
            return this;
        }
        public java.util.List<ListImageTestResultsResponseBodyPagingInfoTestResultList> getTestResultList() {
            return this.testResultList;
        }

        public ListImageTestResultsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
