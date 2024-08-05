// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendListResponseBody extends TeaModel {
    /**
     * <p>The backend services.</p>
     */
    @NameInMap("BackendInfoList")
    public java.util.List<DescribeBackendListResponseBodyBackendInfoList> backendInfoList;

    /**
     * <p>The number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>090A0DF9-9144-5236-8CBA-E18DE317722D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBackendListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendListResponseBody self = new DescribeBackendListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackendListResponseBody setBackendInfoList(java.util.List<DescribeBackendListResponseBodyBackendInfoList> backendInfoList) {
        this.backendInfoList = backendInfoList;
        return this;
    }
    public java.util.List<DescribeBackendListResponseBodyBackendInfoList> getBackendInfoList() {
        return this.backendInfoList;
    }

    public DescribeBackendListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackendListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackendListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackendListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackendListResponseBodyBackendInfoListTags extends TeaModel {
        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>groupName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>e3b881d0-e2d0-4dfb-b1fb-a2a3d1e534b7</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeBackendListResponseBodyBackendInfoListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendListResponseBodyBackendInfoListTags self = new DescribeBackendListResponseBodyBackendInfoListTags();
            return TeaModel.build(map, self);
        }

        public DescribeBackendListResponseBodyBackendInfoListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackendListResponseBodyBackendInfoListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeBackendListResponseBodyBackendInfoList extends TeaModel {
        /**
         * <p>The ID of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>35bd31d32c9c425ebbe9330db9f8c375</p>
         */
        @NameInMap("BackendId")
        public String backendId;

        /**
         * <p>The name of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BackendName")
        public String backendName;

        /**
         * <p>The type of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("BackendType")
        public String backendType;

        /**
         * <p>The time when the backend service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-25T11:22:29Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the backend service was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-25T11:22:29Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeBackendListResponseBodyBackendInfoListTags> tags;

        public static DescribeBackendListResponseBodyBackendInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendListResponseBodyBackendInfoList self = new DescribeBackendListResponseBodyBackendInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeBackendListResponseBodyBackendInfoList setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeBackendListResponseBodyBackendInfoList setBackendName(String backendName) {
            this.backendName = backendName;
            return this;
        }
        public String getBackendName() {
            return this.backendName;
        }

        public DescribeBackendListResponseBodyBackendInfoList setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

        public DescribeBackendListResponseBodyBackendInfoList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeBackendListResponseBodyBackendInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBackendListResponseBodyBackendInfoList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeBackendListResponseBodyBackendInfoList setTags(java.util.List<DescribeBackendListResponseBodyBackendInfoListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeBackendListResponseBodyBackendInfoListTags> getTags() {
            return this.tags;
        }

    }

}
