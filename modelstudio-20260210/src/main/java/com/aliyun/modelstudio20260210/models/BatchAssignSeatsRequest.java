// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class BatchAssignSeatsRequest extends TeaModel {
    /**
     * <p>The list of target member IDs.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The AccountIds in string format.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;5854302538759072\&quot;]</p>
     */
    @NameInMap("AccountIdsStr")
    public String accountIdsStr;

    /**
     * <p>The account ID of the caller that identifies the initiator of this call.</p>
     * 
     * <strong>example:</strong>
     * <p>acc_123456789</p>
     */
    @NameInMap("CallerUacAccountId")
    public String callerUacAccountId;

    /**
     * <p>The language setting. Valid values: zh-CN and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>The product namespace ID. For the TokenPlan product, this field is fixed to namespace-1.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace-1</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The seat type. Valid values: standard, pro, and max.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SeatType")
    public String seatType;

    /**
     * <p>The ID of the target workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws_123456789</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static BatchAssignSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAssignSeatsRequest self = new BatchAssignSeatsRequest();
        return TeaModel.build(map, self);
    }

    public BatchAssignSeatsRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public BatchAssignSeatsRequest setAccountIdsStr(String accountIdsStr) {
        this.accountIdsStr = accountIdsStr;
        return this;
    }
    public String getAccountIdsStr() {
        return this.accountIdsStr;
    }

    public BatchAssignSeatsRequest setCallerUacAccountId(String callerUacAccountId) {
        this.callerUacAccountId = callerUacAccountId;
        return this;
    }
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    public BatchAssignSeatsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public BatchAssignSeatsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public BatchAssignSeatsRequest setSeatType(String seatType) {
        this.seatType = seatType;
        return this;
    }
    public String getSeatType() {
        return this.seatType;
    }

    public BatchAssignSeatsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
