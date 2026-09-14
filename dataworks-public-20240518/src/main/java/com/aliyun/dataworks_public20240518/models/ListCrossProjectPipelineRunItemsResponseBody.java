// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectPipelineRunItemsResponseBody extends TeaModel {
    /**
     * <p>The business response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PageNumber&quot;:1,&quot;PageSize&quot;:10,&quot;TotalCount&quot;:1,&quot;PipelineRunItems&quot;:[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;IsRoot&quot;:true,&quot;Status&quot;:&quot;Ready&quot;}]}</p>
     */
    @NameInMap("Data")
    public ListCrossProjectPipelineRunItemsResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCrossProjectPipelineRunItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectPipelineRunItemsResponseBody self = new ListCrossProjectPipelineRunItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectPipelineRunItemsResponseBody setData(ListCrossProjectPipelineRunItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCrossProjectPipelineRunItemsResponseBodyData getData() {
        return this.data;
    }

    public ListCrossProjectPipelineRunItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrossProjectPipelineRunItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems extends TeaModel {
        /**
         * <p>The change type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DeploymentItemFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployment failed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the object is a root object.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRoot")
        public Boolean isRoot;

        /**
         * <p>The ID of the publish object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The name of the publish object.</p>
         * 
         * <strong>example:</strong>
         * <p>object-1</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The object type of the publish object.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The version of the publish object.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ObjectVersion")
        public String objectVersion;

        /**
         * <p>The ID of the parent object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParentObjectId")
        public String parentObjectId;

        /**
         * <p>The status of the publish item.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems build(java.util.Map<String, ?> map) throws Exception {
            ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems self = new ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems();
            return TeaModel.build(map, self);
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setIsRoot(Boolean isRoot) {
            this.isRoot = isRoot;
            return this;
        }
        public Boolean getIsRoot() {
            return this.isRoot;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setObjectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public String getObjectVersion() {
            return this.objectVersion;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setParentObjectId(String parentObjectId) {
            this.parentObjectId = parentObjectId;
            return this;
        }
        public String getParentObjectId() {
            return this.parentObjectId;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListCrossProjectPipelineRunItemsResponseBodyData extends TeaModel {
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
         * <p>The list of publish items for the root objects and their child objects that are included in the cross-workspace publish pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;IsRoot&quot;:true,&quot;Status&quot;:&quot;Ready&quot;}]</p>
         */
        @NameInMap("PipelineRunItems")
        public java.util.List<ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems> pipelineRunItems;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCrossProjectPipelineRunItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCrossProjectPipelineRunItemsResponseBodyData self = new ListCrossProjectPipelineRunItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCrossProjectPipelineRunItemsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyData setPipelineRunItems(java.util.List<ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems> pipelineRunItems) {
            this.pipelineRunItems = pipelineRunItems;
            return this;
        }
        public java.util.List<ListCrossProjectPipelineRunItemsResponseBodyDataPipelineRunItems> getPipelineRunItems() {
            return this.pipelineRunItems;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListCrossProjectPipelineRunItemsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
