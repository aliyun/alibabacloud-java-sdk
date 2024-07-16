// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateWirelessCloudConnectorRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Business</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>TF-******-1633255280-43c94bf7-2dd3-4c14-8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetLinks")
    public java.util.List<CreateWirelessCloudConnectorRequestNetLinks> netLinks;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UseCase")
    public String useCase;

    public static CreateWirelessCloudConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWirelessCloudConnectorRequest self = new CreateWirelessCloudConnectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateWirelessCloudConnectorRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateWirelessCloudConnectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWirelessCloudConnectorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWirelessCloudConnectorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateWirelessCloudConnectorRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public CreateWirelessCloudConnectorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWirelessCloudConnectorRequest setNetLinks(java.util.List<CreateWirelessCloudConnectorRequestNetLinks> netLinks) {
        this.netLinks = netLinks;
        return this;
    }
    public java.util.List<CreateWirelessCloudConnectorRequestNetLinks> getNetLinks() {
        return this.netLinks;
    }

    public CreateWirelessCloudConnectorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWirelessCloudConnectorRequest setUseCase(String useCase) {
        this.useCase = useCase;
        return this;
    }
    public String getUseCase() {
        return this.useCase;
    }

    public static class CreateWirelessCloudConnectorRequestNetLinks extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zjalyjs01s.5gjs.njiot</p>
         */
        @NameInMap("APN")
        public String APN;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VSwitchs")
        public java.util.List<String> vSwitchs;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateWirelessCloudConnectorRequestNetLinks build(java.util.Map<String, ?> map) throws Exception {
            CreateWirelessCloudConnectorRequestNetLinks self = new CreateWirelessCloudConnectorRequestNetLinks();
            return TeaModel.build(map, self);
        }

        public CreateWirelessCloudConnectorRequestNetLinks setAPN(String APN) {
            this.APN = APN;
            return this;
        }
        public String getAPN() {
            return this.APN;
        }

        public CreateWirelessCloudConnectorRequestNetLinks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateWirelessCloudConnectorRequestNetLinks setVSwitchs(java.util.List<String> vSwitchs) {
            this.vSwitchs = vSwitchs;
            return this;
        }
        public java.util.List<String> getVSwitchs() {
            return this.vSwitchs;
        }

        public CreateWirelessCloudConnectorRequestNetLinks setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
