// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListUpgradeItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UpgradeItems")
    public java.util.List<ListUpgradeItemsResponseBodyUpgradeItems> upgradeItems;

    public static ListUpgradeItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeItemsResponseBody self = new ListUpgradeItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpgradeItemsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUpgradeItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUpgradeItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUpgradeItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUpgradeItemsResponseBody setUpgradeItems(java.util.List<ListUpgradeItemsResponseBodyUpgradeItems> upgradeItems) {
        this.upgradeItems = upgradeItems;
        return this;
    }
    public java.util.List<ListUpgradeItemsResponseBodyUpgradeItems> getUpgradeItems() {
        return this.upgradeItems;
    }

    public static class ListUpgradeItemsResponseBodyUpgradeItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data_storage_2_upgrade</p>
         */
        @NameInMap("UpgradeItemId")
        public String upgradeItemId;

        public static ListUpgradeItemsResponseBodyUpgradeItems build(java.util.Map<String, ?> map) throws Exception {
            ListUpgradeItemsResponseBodyUpgradeItems self = new ListUpgradeItemsResponseBodyUpgradeItems();
            return TeaModel.build(map, self);
        }

        public ListUpgradeItemsResponseBodyUpgradeItems setUpgradeItemId(String upgradeItemId) {
            this.upgradeItemId = upgradeItemId;
            return this;
        }
        public String getUpgradeItemId() {
            return this.upgradeItemId;
        }

    }

}
