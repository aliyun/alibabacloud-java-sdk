// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAntAndCloudAuthUserStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether financial-grade real-person authentication is activated. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Activated</li>
     * <li><strong>false</strong>: Not activated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AntcloudauthEnabled")
    public Boolean antcloudauthEnabled;

    /**
     * <p>Indicates whether real-person authentication is activated. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Activated</li>
     * <li><strong>false</strong>: Not activated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CloudauthEnabled")
    public Boolean cloudauthEnabled;

    /**
     * <p>Indicates whether the enhanced version of real-person authentication is activated. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Activated</li>
     * <li><strong>false</strong>: Not activated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CloudauthstEnabled")
    public Boolean cloudauthstEnabled;

    /**
     * <p>Indicates whether information verification is activated. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Activated</li>
     * <li><strong>false</strong>: Not activated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InforverifyEnabled")
    public Boolean inforverifyEnabled;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE07CCE-DF47-51C2-9D32-CD70ED62C91B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAntAndCloudAuthUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntAndCloudAuthUserStatusResponseBody self = new DescribeAntAndCloudAuthUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntAndCloudAuthUserStatusResponseBody setAntcloudauthEnabled(Boolean antcloudauthEnabled) {
        this.antcloudauthEnabled = antcloudauthEnabled;
        return this;
    }
    public Boolean getAntcloudauthEnabled() {
        return this.antcloudauthEnabled;
    }

    public DescribeAntAndCloudAuthUserStatusResponseBody setCloudauthEnabled(Boolean cloudauthEnabled) {
        this.cloudauthEnabled = cloudauthEnabled;
        return this;
    }
    public Boolean getCloudauthEnabled() {
        return this.cloudauthEnabled;
    }

    public DescribeAntAndCloudAuthUserStatusResponseBody setCloudauthstEnabled(Boolean cloudauthstEnabled) {
        this.cloudauthstEnabled = cloudauthstEnabled;
        return this;
    }
    public Boolean getCloudauthstEnabled() {
        return this.cloudauthstEnabled;
    }

    public DescribeAntAndCloudAuthUserStatusResponseBody setInforverifyEnabled(Boolean inforverifyEnabled) {
        this.inforverifyEnabled = inforverifyEnabled;
        return this;
    }
    public Boolean getInforverifyEnabled() {
        return this.inforverifyEnabled;
    }

    public DescribeAntAndCloudAuthUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
