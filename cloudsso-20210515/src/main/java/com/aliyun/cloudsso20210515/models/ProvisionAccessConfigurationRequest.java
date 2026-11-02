// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ProvisionAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The access configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the deployment target belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("OriginTargetId")
    public String originTargetId;

    /**
     * <p>The ID of the task target.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The target type of the task. Valid values:</p>
     * <ul>
     * <li>RD-Account: The task target is an account in a resource directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ProvisionAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ProvisionAccessConfigurationRequest self = new ProvisionAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ProvisionAccessConfigurationRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public ProvisionAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ProvisionAccessConfigurationRequest setOriginTargetId(String originTargetId) {
        this.originTargetId = originTargetId;
        return this;
    }
    public String getOriginTargetId() {
        return this.originTargetId;
    }

    public ProvisionAccessConfigurationRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ProvisionAccessConfigurationRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
