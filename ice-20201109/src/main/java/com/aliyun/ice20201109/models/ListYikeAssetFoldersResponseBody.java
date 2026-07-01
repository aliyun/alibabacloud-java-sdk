// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListYikeAssetFoldersResponseBody extends TeaModel {
    /**
     * <p>The folder list.</p>
     */
    @NameInMap("FolderList")
    public java.util.List<ListYikeAssetFoldersResponseBodyFolderList> folderList;

    /**
     * <p>The maximum number of results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. If this parameter is not returned, all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>Token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of folders.</p>
     * 
     * <strong>example:</strong>
     * <p>78</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListYikeAssetFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYikeAssetFoldersResponseBody self = new ListYikeAssetFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYikeAssetFoldersResponseBody setFolderList(java.util.List<ListYikeAssetFoldersResponseBodyFolderList> folderList) {
        this.folderList = folderList;
        return this;
    }
    public java.util.List<ListYikeAssetFoldersResponseBodyFolderList> getFolderList() {
        return this.folderList;
    }

    public ListYikeAssetFoldersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListYikeAssetFoldersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListYikeAssetFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListYikeAssetFoldersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListYikeAssetFoldersResponseBodyFolderList extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-22T02:07:06Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-EXRyxc5SHY</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The folder name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>Indicates whether the folder is the default folder.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_183320223010****</p>
         */
        @NameInMap("ProductionId")
        public String productionId;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-odl2p61i4vfbph4g</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListYikeAssetFoldersResponseBodyFolderList build(java.util.Map<String, ?> map) throws Exception {
            ListYikeAssetFoldersResponseBodyFolderList self = new ListYikeAssetFoldersResponseBodyFolderList();
            return TeaModel.build(map, self);
        }

        public ListYikeAssetFoldersResponseBodyFolderList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setProductionId(String productionId) {
            this.productionId = productionId;
            return this;
        }
        public String getProductionId() {
            return this.productionId;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
