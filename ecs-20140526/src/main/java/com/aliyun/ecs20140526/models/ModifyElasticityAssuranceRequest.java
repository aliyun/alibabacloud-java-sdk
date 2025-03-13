// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ModifyElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the elasticity assurance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The total number of instances for which you want to reserve capacity. Valid values: the number of created instances to 1000. This parameter is mutually exclusive with other parameters in the same request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The assurance schedules based on which the capacity reservation takes effect.</p>
     * <blockquote>
     * <p> Time-segmented elasticity assurances are available only in specific regions and to specific users. To use time-segmented elasticity assurances, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     */
    @NameInMap("RecurrenceRules")
    public java.util.List<ModifyElasticityAssuranceRequestRecurrenceRules> recurrenceRules;

    /**
     * <p>The region ID of the elasticity assurance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyElasticityAssuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticityAssuranceRequest self = new ModifyElasticityAssuranceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticityAssuranceRequest setPrivatePoolOptions(ModifyElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyElasticityAssuranceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyElasticityAssuranceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyElasticityAssuranceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyElasticityAssuranceRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public ModifyElasticityAssuranceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyElasticityAssuranceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyElasticityAssuranceRequest setRecurrenceRules(java.util.List<ModifyElasticityAssuranceRequestRecurrenceRules> recurrenceRules) {
        this.recurrenceRules = recurrenceRules;
        return this;
    }
    public java.util.List<ModifyElasticityAssuranceRequestRecurrenceRules> getRecurrenceRules() {
        return this.recurrenceRules;
    }

    public ModifyElasticityAssuranceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyElasticityAssuranceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyElasticityAssuranceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyElasticityAssuranceRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the elasticity assurance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the elasticity assurance. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>eapTestName</p>
         */
        @NameInMap("Name")
        public String name;

        public static ModifyElasticityAssuranceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyElasticityAssuranceRequestPrivatePoolOptions self = new ModifyElasticityAssuranceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyElasticityAssuranceRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyElasticityAssuranceRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ModifyElasticityAssuranceRequestRecurrenceRules extends TeaModel {
        /**
         * <p>The end time of the assurance period for the capacity reservation. Specify an on-the-hour point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The type of the assurance schedule. Valid values:</p>
         * <ul>
         * <li>Daily</li>
         * <li>Weekly</li>
         * <li>Monthly</li>
         * </ul>
         * <blockquote>
         * <p> You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The days of the week or month on which the capacity reservation takes effect or the interval, in number of days, at which the capacity reservation takes effect.</p>
         * <ul>
         * <li>If you set <code>RecurrenceType</code> to <code>Daily</code>, you can specify only one value for this parameter. Valid values: 1 to 31. The value specifies that the capacity reservation takes effect every few days.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Weekly</code>, you can specify multiple values for this parameter. Separate the values with commas (,). Valid values: 0, 1, 2, 3, 4, 5, and 6, which specify Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday, respectively. Example: <code>1,2</code>, which specifies that the capacity reservation takes effect on Monday and Tuesday.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Monthly</code>, you can specify two values in the <code>A-B</code> format for this parameter. Valid values of A and B: 1 to 31. B must be greater than or equal to A. Example: <code>1-5</code>, which specifies that the capacity reservation takes effect every day from the first day up to the fifth day of each month.</li>
         * </ul>
         * <blockquote>
         * <p> You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The start time of the assurance period for the capacity reservation. Specify an on-the-hour point in time.</p>
         * <blockquote>
         * <p> You must specify both <code>StartHour</code> and <code>EndHour</code>. EndHour must be at least four hours later than StartHour.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("StartHour")
        public Integer startHour;

        public static ModifyElasticityAssuranceRequestRecurrenceRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyElasticityAssuranceRequestRecurrenceRules self = new ModifyElasticityAssuranceRequestRecurrenceRules();
            return TeaModel.build(map, self);
        }

        public ModifyElasticityAssuranceRequestRecurrenceRules setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public ModifyElasticityAssuranceRequestRecurrenceRules setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public ModifyElasticityAssuranceRequestRecurrenceRules setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public ModifyElasticityAssuranceRequestRecurrenceRules setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

    }

}
