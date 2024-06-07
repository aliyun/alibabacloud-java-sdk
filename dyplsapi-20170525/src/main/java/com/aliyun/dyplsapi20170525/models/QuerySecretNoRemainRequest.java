// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoRemainRequest extends TeaModel {
    /**
     * <p>The home location of the phone number.</p>
     * <br>
     * <p>*   If **SpecId** is set to 1 or 2, you can specify the **City** parameter to query the quantity of available phone numbers.</p>
     * <br>
     * <p>1.  You can enter a single city name to perform a query.</p>
     * <p>2.  You can enter National to query the quantity of remaining phone numbers available in the Chinese mainland for online purchase.</p>
     * <p>3.  You can enter National List to query the cities with available phone numbers and the quantities of remaining phone numbers in the Chinese mainland. Cities without available phone numbers will not be returned.</p>
     * <br>
     * <p>*   If **SpecId** is set to 3, home locations are not distinguished for phone numbers that start with 95 and only the quantity of all the remaining phone numbers that start with 95 and are available for online purchase can be queried. If SpecId is set to 3, **City** must be set to **Nationwide**.</p>
     * <br>
     * <p>>  Home locations can be set to only locations in the Chinese mainland.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("City")
    public String city;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The prefix of the phone number. When you call the QuerySecretNoRemain operation with **SecretNo** specified, the quantity of remaining phone numbers with the specified prefix that are available for online purchase is queried.</p>
     * <br>
     * <p>Up to 18 digits of a phone number prefix can be specified.</p>
     */
    @NameInMap("SecretNo")
    public String secretNo;

    /**
     * <p>The type of the phone number. Valid values:</p>
     * <br>
     * <p>*   **1**: a phone number assigned by a virtual network operator, that is, a phone number that belongs to the 170 or 171 number segment.</p>
     * <p>*   **2**: a phone number provided by a carrier.</p>
     * <p>*   **3**: a phone number that starts with 95.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpecId")
    public Long specId;

    public static QuerySecretNoRemainRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoRemainRequest self = new QuerySecretNoRemainRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoRemainRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QuerySecretNoRemainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySecretNoRemainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySecretNoRemainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySecretNoRemainRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

    public QuerySecretNoRemainRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
