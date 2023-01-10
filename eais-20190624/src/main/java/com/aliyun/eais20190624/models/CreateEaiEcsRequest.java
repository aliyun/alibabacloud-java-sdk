// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEcsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EaisName")
    public String eaisName;

    @NameInMap("EaisType")
    public String eaisType;

    @NameInMap("Ecs")
    public CreateEaiEcsRequestEcs ecs;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateEaiEcsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiEcsRequest self = new CreateEaiEcsRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiEcsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiEcsRequest setEaisName(String eaisName) {
        this.eaisName = eaisName;
        return this;
    }
    public String getEaisName() {
        return this.eaisName;
    }

    public CreateEaiEcsRequest setEaisType(String eaisType) {
        this.eaisType = eaisType;
        return this;
    }
    public String getEaisType() {
        return this.eaisType;
    }

    public CreateEaiEcsRequest setEcs(CreateEaiEcsRequestEcs ecs) {
        this.ecs = ecs;
        return this;
    }
    public CreateEaiEcsRequestEcs getEcs() {
        return this.ecs;
    }

    public CreateEaiEcsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiEcsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEaiEcsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEaiEcsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateEaiEcsRequestEcs extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InternetMaxBandwidthIn")
        public String internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public String internetMaxBandwidthOut;

        @NameInMap("Name")
        public String name;

        @NameInMap("Password")
        public String password;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        @NameInMap("Type")
        public String type;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateEaiEcsRequestEcs build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiEcsRequestEcs self = new CreateEaiEcsRequestEcs();
            return TeaModel.build(map, self);
        }

        public CreateEaiEcsRequestEcs setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateEaiEcsRequestEcs setInternetMaxBandwidthIn(String internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public String getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public CreateEaiEcsRequestEcs setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public String getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public CreateEaiEcsRequestEcs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEaiEcsRequestEcs setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateEaiEcsRequestEcs setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateEaiEcsRequestEcs setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateEaiEcsRequestEcs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEaiEcsRequestEcs setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
