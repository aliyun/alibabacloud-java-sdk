// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectRouterInterRegionTransitModeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a unique value from your client for this parameter. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sends a check request without modifying the service resource.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the Express Connect Router (ECR) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The list of inter-region forwarding modes.</p>
     */
    @NameInMap("TransitModeList")
    public java.util.List<ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList> transitModeList;

    @NameInMap("Version")
    public String version;

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

    public ModifyExpressConnectRouterInterRegionTransitModeRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ModifyExpressConnectRouterInterRegionTransitModeRequestTransitModeList extends TeaModel {
        /**
         * <p>The inter-region forwarding mode of the ECR. Valid values:</p>
         * <ul>
         * <li><p><strong>ECMP</strong>: The load balancing mode.</p>
         * </li>
         * <li><p><strong>NearBy</strong>: The nearby forwarding mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECMP</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The region where the ECR instance is deployed.</p>
         * 
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
