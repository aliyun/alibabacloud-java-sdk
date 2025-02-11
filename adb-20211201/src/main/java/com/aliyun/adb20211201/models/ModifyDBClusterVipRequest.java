// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterVipRequest extends TeaModel {
    /**
     * <p>The endpoint of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2ze8mbuai974s4y2500000169.ads.aliyuncs.com</p>
     */
    @NameInMap("ConnectString")
    public String connectString;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-2ze8mbuai97*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The VPC ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The new <strong>VPC</strong> must reside in the same region as the cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1at5ze0t5u3xtqn****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The new vSwitch must reside in the same zone as the cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1aadw9k19x6cis9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyDBClusterVipRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterVipRequest self = new ModifyDBClusterVipRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterVipRequest setConnectString(String connectString) {
        this.connectString = connectString;
        return this;
    }
    public String getConnectString() {
        return this.connectString;
    }

    public ModifyDBClusterVipRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterVipRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBClusterVipRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
