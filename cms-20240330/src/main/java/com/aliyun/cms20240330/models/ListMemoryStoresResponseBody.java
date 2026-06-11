// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListMemoryStoresResponseBody extends TeaModel {
    /**
     * <p>The maximum number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The list of memory stores.</p>
     */
    @NameInMap("memoryStores")
    public java.util.List<ListMemoryStoresResponseBodyMemoryStores> memoryStores;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16C0A6D6-C3E7-511D-A60B-A87FD85F5BA7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static ListMemoryStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryStoresResponseBody self = new ListMemoryStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoryStoresResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryStoresResponseBody setMemoryStores(java.util.List<ListMemoryStoresResponseBodyMemoryStores> memoryStores) {
        this.memoryStores = memoryStores;
        return this;
    }
    public java.util.List<ListMemoryStoresResponseBodyMemoryStores> getMemoryStores() {
        return this.memoryStores;
    }

    public ListMemoryStoresResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoryStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemoryStoresResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListMemoryStoresResponseBodyMemoryStores extends TeaModel {
        /**
         * <p>The time when the memory store was created.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1764556182850</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the memory store.</p>
         * 
         * <strong>example:</strong>
         * <p>Created by taishan-module-recovery</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the memory store.</p>
         * 
         * <strong>example:</strong>
         * <p>qianyi_test_1</p>
         */
        @NameInMap("memoryStoreName")
        public String memoryStoreName;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The time when the memory store was last updated.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1764556182850</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>Workspace</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1646467597142798-cn-shenzhen</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListMemoryStoresResponseBodyMemoryStores build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryStoresResponseBodyMemoryStores self = new ListMemoryStoresResponseBodyMemoryStores();
            return TeaModel.build(map, self);
        }

        public ListMemoryStoresResponseBodyMemoryStores setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMemoryStoresResponseBodyMemoryStores setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMemoryStoresResponseBodyMemoryStores setMemoryStoreName(String memoryStoreName) {
            this.memoryStoreName = memoryStoreName;
            return this;
        }
        public String getMemoryStoreName() {
            return this.memoryStoreName;
        }

        public ListMemoryStoresResponseBodyMemoryStores setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListMemoryStoresResponseBodyMemoryStores setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListMemoryStoresResponseBodyMemoryStores setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
