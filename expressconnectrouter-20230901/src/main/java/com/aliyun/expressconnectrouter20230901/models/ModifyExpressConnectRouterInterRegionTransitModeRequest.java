// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterInterRegionTransitModeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("TransitModeList")
    public java.util.List<ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList> transitModeList;

    public static ModifyExpressConnectRouterInterRegionTransitModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectRouterInterRegionTransitModeRequest self = new ModifyExpressConnectRouterInterRegionTransitModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectRouterInterRegionTransitModeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyExpressConnectRouterInterRegionTransitModeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyExpressConnectRouterInterRegionTransitModeRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public ModifyExpressConnectRouterInterRegionTransitModeRequest setTransitModeList(java.util.List<ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList> transitModeList) {
        this.transitModeList = transitModeList;
        return this;
    }
    public java.util.List<ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList> getTransitModeList() {
        return this.transitModeList;
    }

    public static class ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ECMP</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList build(java.util.Map<String, ?> map) throws Exception {
            ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList self = new ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList();
            return TeaModel.build(map, self);
        }

        public ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
