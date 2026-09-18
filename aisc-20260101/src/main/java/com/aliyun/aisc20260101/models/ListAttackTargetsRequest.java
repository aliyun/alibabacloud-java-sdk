// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListAttackTargetsRequest extends TeaModel {
    /**
     * <p>The upper bound (inclusive) of the first scan time range. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735689600000</p>
     */
    @NameInMap("FirstScanTimeEnd")
    public String firstScanTimeEnd;

    /**
     * <p>The lower bound (inclusive) of the first scan time range. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735689600000</p>
     */
    @NameInMap("FirstScanTimeStart")
    public String firstScanTimeStart;

    /**
     * <p>Filters targets by the status of the most recent scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("LastScanStatus")
    public String lastScanStatus;

    /**
     * <p>The upper bound (inclusive) of the last scan time range. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735689600000</p>
     */
    @NameInMap("LastScanTimeEnd")
    public String lastScanTimeEnd;

    /**
     * <p>The lower bound (inclusive) of the last scan time range. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735689600000</p>
     */
    @NameInMap("LastScanTimeStart")
    public String lastScanTimeStart;

    /**
     * <p>The page number. Pages start from 1. Values less than 1 are normalized to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100. Values greater than 100 are clamped to 100. Values less than 1 return HTTP status code 400.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Filters targets by the exact business label of the model or agent provider. This parameter is decoupled from ConnectionMethod (technical protocol).</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>Filters targets by the risk level derived from the most recent completed scan task. Targets that have never been scanned do not have a risk level and are not matched by any value.</p>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The field used for sorting. Only the following three aggregate fields are supported. Sorting is performed in memory. If this parameter is not specified, no additional sorting is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>lastScanTime</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The sort order. Targets with null aggregate values are always placed last regardless of the sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>Filters targets by name using fuzzy match (substring match). If this parameter is not specified, all targets are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Bailian</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>Filters targets by the exact scan target type.</p>
     * 
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListAttackTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAttackTargetsRequest self = new ListAttackTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ListAttackTargetsRequest setFirstScanTimeEnd(String firstScanTimeEnd) {
        this.firstScanTimeEnd = firstScanTimeEnd;
        return this;
    }
    public String getFirstScanTimeEnd() {
        return this.firstScanTimeEnd;
    }

    public ListAttackTargetsRequest setFirstScanTimeStart(String firstScanTimeStart) {
        this.firstScanTimeStart = firstScanTimeStart;
        return this;
    }
    public String getFirstScanTimeStart() {
        return this.firstScanTimeStart;
    }

    public ListAttackTargetsRequest setLastScanStatus(String lastScanStatus) {
        this.lastScanStatus = lastScanStatus;
        return this;
    }
    public String getLastScanStatus() {
        return this.lastScanStatus;
    }

    public ListAttackTargetsRequest setLastScanTimeEnd(String lastScanTimeEnd) {
        this.lastScanTimeEnd = lastScanTimeEnd;
        return this;
    }
    public String getLastScanTimeEnd() {
        return this.lastScanTimeEnd;
    }

    public ListAttackTargetsRequest setLastScanTimeStart(String lastScanTimeStart) {
        this.lastScanTimeStart = lastScanTimeStart;
        return this;
    }
    public String getLastScanTimeStart() {
        return this.lastScanTimeStart;
    }

    public ListAttackTargetsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAttackTargetsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAttackTargetsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListAttackTargetsRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ListAttackTargetsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListAttackTargetsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListAttackTargetsRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ListAttackTargetsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
