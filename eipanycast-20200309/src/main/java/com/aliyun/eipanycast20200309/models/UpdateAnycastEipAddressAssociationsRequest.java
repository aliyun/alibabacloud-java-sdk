// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UpdateAnycastEipAddressAssociationsRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aeip-bp1ix34fralt4ykf3****</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The association mode. Valid values:</p>
     * <ul>
     * <li><strong>Default</strong>: the default mode. In this mode, cloud resources to be associated are set as default origin servers.</li>
     * <li><strong>Normal</strong>: the standard mode. In this mode, cloud resources to be associated are set as standard origin servers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("AssociationMode")
    public String associationMode;

    /**
     * <p>The ID of the cloud resource with which you want to associate the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-d7oxbixhxv1uupnon****</p>
     */
    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the system automatically uses <strong>RequestId</strong> as <strong>ClientToken</strong>. <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without updating the association information. The system checks the required parameters, request syntax, and limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The access areas and access points to be added.</p>
     */
    @NameInMap("PopLocationAddList")
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationAddList> popLocationAddList;

    /**
     * <p>The access areas and access points to be deleted.</p>
     */
    @NameInMap("PopLocationDeleteList")
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList> popLocationDeleteList;

    public static UpdateAnycastEipAddressAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnycastEipAddressAssociationsRequest self = new UpdateAnycastEipAddressAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAnycastEipAddressAssociationsRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public UpdateAnycastEipAddressAssociationsRequest setAssociationMode(String associationMode) {
        this.associationMode = associationMode;
        return this;
    }
    public String getAssociationMode() {
        return this.associationMode;
    }

    public UpdateAnycastEipAddressAssociationsRequest setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public UpdateAnycastEipAddressAssociationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAnycastEipAddressAssociationsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateAnycastEipAddressAssociationsRequest setPopLocationAddList(java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationAddList> popLocationAddList) {
        this.popLocationAddList = popLocationAddList;
        return this;
    }
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationAddList> getPopLocationAddList() {
        return this.popLocationAddList;
    }

    public UpdateAnycastEipAddressAssociationsRequest setPopLocationDeleteList(java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList> popLocationDeleteList) {
        this.popLocationDeleteList = popLocationDeleteList;
        return this;
    }
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList> getPopLocationDeleteList() {
        return this.popLocationDeleteList;
    }

    public static class UpdateAnycastEipAddressAssociationsRequestPopLocationAddList extends TeaModel {
        /**
         * <p>The access points in the access areas to be added.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/171938.html">DescribeAnycastPopLocations</a> operation to query the access points in supported access areas.</p>
         * 
         * <strong>example:</strong>
         * <p>us-west-1-pop</p>
         */
        @NameInMap("PopLocation")
        public String popLocation;

        public static UpdateAnycastEipAddressAssociationsRequestPopLocationAddList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAnycastEipAddressAssociationsRequestPopLocationAddList self = new UpdateAnycastEipAddressAssociationsRequestPopLocationAddList();
            return TeaModel.build(map, self);
        }

        public UpdateAnycastEipAddressAssociationsRequestPopLocationAddList setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

    public static class UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList extends TeaModel {
        /**
         * <p>The access points in the access areas to be deleted.</p>
         * <blockquote>
         * <p> If the access point in the access area is associated with a default origin server, you cannot delete the access point in the access area.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eu-west-1-pop</p>
         */
        @NameInMap("PopLocation")
        public String popLocation;

        public static UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList self = new UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList();
            return TeaModel.build(map, self);
        }

        public UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

}
