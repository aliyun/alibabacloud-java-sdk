// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoRemainRequest extends TeaModel {
    /**
     * <p>The home location of the phone number.</p>
     * <ul>
     * <li>If <strong>SpecId</strong> is set to 1 or 2, you can specify the <strong>City</strong> parameter to query the quantity of available phone numbers.</li>
     * </ul>
     * <ol>
     * <li>You can enter a single city name to perform a query.</li>
     * <li>You can enter National to query the quantity of remaining phone numbers available in the Chinese mainland for online purchase.</li>
     * <li>You can enter National List to query the cities with available phone numbers and the quantities of remaining phone numbers in the Chinese mainland. Cities without available phone numbers will not be returned.</li>
     * </ol>
     * <ul>
     * <li>If <strong>SpecId</strong> is set to 3, home locations are not distinguished for phone numbers that start with 95 and only the quantity of all the remaining phone numbers that start with 95 and are available for online purchase can be queried. If SpecId is set to 3, <strong>City</strong> must be set to <strong>Nationwide</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> Home locations can be set to only locations in the Chinese mainland.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
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
     * <p>The prefix of the phone number. When you call the QuerySecretNoRemain operation with <strong>SecretNo</strong> specified, the quantity of remaining phone numbers with the specified prefix that are available for online purchase is queried.</p>
     * <p>Up to 18 digits of a phone number prefix can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>130</p>
     */
    @NameInMap("SecretNo")
    public String secretNo;

    /**
     * <p>The type of the phone number. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: a phone number assigned by a virtual network operator, that is, a phone number that belongs to the 170 or 171 number segment.</li>
     * <li><strong>2</strong>: a phone number provided by a carrier.</li>
     * <li><strong>3</strong>: a phone number that starts with 95.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
