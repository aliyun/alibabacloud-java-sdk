// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripBusinessInstanceQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("business_instance_id")
    public String businessInstanceId;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("third_business_id")
    public String thirdBusinessId;

    /**
     * <strong>example:</strong>
     * <p>thirdpart12138</p>
     */
    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static TripBusinessInstanceQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TripBusinessInstanceQueryRequest self = new TripBusinessInstanceQueryRequest();
        return TeaModel.build(map, self);
    }

    public TripBusinessInstanceQueryRequest setBusinessInstanceId(String businessInstanceId) {
        this.businessInstanceId = businessInstanceId;
        return this;
    }
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

    public TripBusinessInstanceQueryRequest setThirdBusinessId(String thirdBusinessId) {
        this.thirdBusinessId = thirdBusinessId;
        return this;
    }
    public String getThirdBusinessId() {
        return this.thirdBusinessId;
    }

    public TripBusinessInstanceQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public TripBusinessInstanceQueryRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
