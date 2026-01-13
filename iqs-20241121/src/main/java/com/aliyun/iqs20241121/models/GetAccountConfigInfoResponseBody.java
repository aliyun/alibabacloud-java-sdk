// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetAccountConfigInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("accountStatus")
    public String accountStatus;

    /**
     * <strong>example:</strong>
     * <p>2025-07-12 12:00:00</p>
     */
    @NameInMap("availableTime")
    public String availableTime;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("billQps")
    public String billQps;

    /**
     * <strong>example:</strong>
     * <p>FixLadder</p>
     */
    @NameInMap("ladderType")
    public String ladderType;

    /**
     * <strong>example:</strong>
     * <p>12123123123</p>
     */
    @NameInMap("mainAccountId")
    public String mainAccountId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6788a2c2-157d4ebe-ad979cd4f296</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAccountConfigInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountConfigInfoResponseBody self = new GetAccountConfigInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountConfigInfoResponseBody setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public GetAccountConfigInfoResponseBody setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
        return this;
    }
    public String getAvailableTime() {
        return this.availableTime;
    }

    public GetAccountConfigInfoResponseBody setBillQps(String billQps) {
        this.billQps = billQps;
        return this;
    }
    public String getBillQps() {
        return this.billQps;
    }

    public GetAccountConfigInfoResponseBody setLadderType(String ladderType) {
        this.ladderType = ladderType;
        return this;
    }
    public String getLadderType() {
        return this.ladderType;
    }

    public GetAccountConfigInfoResponseBody setMainAccountId(String mainAccountId) {
        this.mainAccountId = mainAccountId;
        return this;
    }
    public String getMainAccountId() {
        return this.mainAccountId;
    }

    public GetAccountConfigInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
