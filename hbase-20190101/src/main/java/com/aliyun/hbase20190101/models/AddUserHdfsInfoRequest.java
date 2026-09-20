// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AddUserHdfsInfoRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16o0pd5****582s</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>dfs.nameservices specifies the nameservices name of DFS. dfs.ha.namenodes specifies the DFS nodes, such as nn1 and nn2.
     * dfs.namenode.http-address.{dfs.nameservices}.nn1 specifies the port 50070 connection of HDFS nn1.
     * dfs.namenode.http-address.{dfs.nameservices}.nn2 specifies the port 50070 connection of HDFS nn2.
     * dfs.namenode.rpc-address.{dfs.nameservices}.nn1 specifies the port 8020 connection of HDFS nn1.
     * dfs.namenode.rpc-address.{dfs.nameservices}.nn2 specifies the port 8020 connection of HDFS nn2.
     * Port 50070 connections and port 8020 connections exist on each HDFS node. The number of port 50070 and port 8020 connection pairs equals the number of HDFS nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dfs.nameservices&quot;:&quot;hdfs_test&quot;,&quot;dfs.ha.namenodes&quot;:&quot;nn1,nn2&quot;,&quot;dfs.namenode.http-address.hdfs_test.nn1&quot;:&quot;TEST-xxx1.com:50070&quot;,&quot;dfs.namenode.http-address.hdfs_test.nn2&quot;:&quot;TEST-xxx2.com:50070&quot;,&quot;dfs.namenode.rpc-address.hdfs_test.nn1&quot;:&quot;TEST-xxx1.com:8020&quot;,&quot;dfs.namenode.rpc-address.hdfs_test.nn2&quot;:&quot;TEST-xxx2.com:8020&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    public static AddUserHdfsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserHdfsInfoRequest self = new AddUserHdfsInfoRequest();
        return TeaModel.build(map, self);
    }

    public AddUserHdfsInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddUserHdfsInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddUserHdfsInfoRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
