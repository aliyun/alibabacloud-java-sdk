// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateInlinePolicyForAccessConfigurationRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("InlinePolicyName")
    public String inlinePolicyName;

    @NameInMap("NewInlinePolicyDocument")
    public String newInlinePolicyDocument;

    public static UpdateInlinePolicyForAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInlinePolicyForAccessConfigurationRequest self = new UpdateInlinePolicyForAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInlinePolicyForAccessConfigurationRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public UpdateInlinePolicyForAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateInlinePolicyForAccessConfigurationRequest setInlinePolicyName(String inlinePolicyName) {
        this.inlinePolicyName = inlinePolicyName;
        return this;
    }
    public String getInlinePolicyName() {
        return this.inlinePolicyName;
    }

    public UpdateInlinePolicyForAccessConfigurationRequest setNewInlinePolicyDocument(String newInlinePolicyDocument) {
        this.newInlinePolicyDocument = newInlinePolicyDocument;
        return this;
    }
    public String getNewInlinePolicyDocument() {
        return this.newInlinePolicyDocument;
    }

}
