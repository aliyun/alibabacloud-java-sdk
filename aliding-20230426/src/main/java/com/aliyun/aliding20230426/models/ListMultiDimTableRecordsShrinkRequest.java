// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMultiDimTableRecordsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101114</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUUg5QSTWwHyeElt8z5z4Qo=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static ListMultiDimTableRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiDimTableRecordsShrinkRequest self = new ListMultiDimTableRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiDimTableRecordsShrinkRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public ListMultiDimTableRecordsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public ListMultiDimTableRecordsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiDimTableRecordsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiDimTableRecordsShrinkRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public ListMultiDimTableRecordsShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
