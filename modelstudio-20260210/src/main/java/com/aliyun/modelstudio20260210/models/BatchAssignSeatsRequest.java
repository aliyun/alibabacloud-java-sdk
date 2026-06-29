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
     * <p>The language. Valid values: zh-CN and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>The seat type. Valid values:</p>
     * <ul>
     * <li>standard: standard seat</li>
     * <li>pro: pro seat</li>
     * <li>max: premium seat</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SeatType")
    public String seatType;

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

    public BatchAssignSeatsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public BatchAssignSeatsRequest setSeatType(String seatType) {
        this.seatType = seatType;
        return this;
    }
    public String getSeatType() {
        return this.seatType;
    }

}
