// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByCallIdRequest extends TeaModel {
    /**
     * <p>The unique ID of the call.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The CallId parameter is included in the response parameters of the outbound call operation that you call to initiate a call.</p>
     * <br>
     * <p>*   The date when the call specified by CallId is started must be the same as the date specified by QueryDate.</p>
     * <br>
     * <p>*   The value of CallId must match the value of ProdId.</p>
     */
    @NameInMap("CallId")
    public String callId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The service ID. Valid values:</p>
     * <br>
     * <p>*   **11000000300006**: voice notification. You can call the [SingleCallByVoice](https://help.aliyun.com/document_detail/393517.html) operation to send a voice notification of the voice notification file type to the specified number.</p>
     * <p>*   **11010000138001**: voice verification code. You can call the [SingleCallByTts](https://help.aliyun.com/document_detail/393519.html) operation to send a voice verification code or a text-to-speech (TTS) voice notification to the specified number.</p>
     * <p>*   **11000000300005**: IVR. You can call the [IvrCall](https://help.aliyun.com/document_detail/393521.html) operation to initiate an interactive voice call to the specified number.</p>
     * <p>*   **11000000300009**: Session Initiation Protocol (SIP) call.</p>
     * <p>*   **11030000180001**: intelligent outbound call.</p>
     */
    @NameInMap("ProdId")
    public Long prodId;

    /**
     * <p>The time at which call details are queried. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>> The system queries the call records that are generated within 24 hours after the specified point in time. For example, if you specify the time 20:00:01 on November 21, 2022, the system queries the call records that are generated for the specified call ID from 20:00:01 on November 21, 2022, to 20:00:01 on November 22, 2022.</p>
     */
    @NameInMap("QueryDate")
    public Long queryDate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryCallDetailByCallIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByCallIdRequest self = new QueryCallDetailByCallIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByCallIdRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public QueryCallDetailByCallIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCallDetailByCallIdRequest setProdId(Long prodId) {
        this.prodId = prodId;
        return this;
    }
    public Long getProdId() {
        return this.prodId;
    }

    public QueryCallDetailByCallIdRequest setQueryDate(Long queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public Long getQueryDate() {
        return this.queryDate;
    }

    public QueryCallDetailByCallIdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCallDetailByCallIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
