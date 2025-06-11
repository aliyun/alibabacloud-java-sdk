// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateInlinePolicyForAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The name of the inline policy.</p>
     * 
     * <strong>example:</strong>
     * <p>InlinePolicy</p>
     */
    @NameInMap("InlinePolicyName")
    public String inlinePolicyName;

    /**
     * <p>The new configurations of the inline policy.</p>
     * <p>The value can be up to 4,096 characters in length.</p>
     * <p>For more information about the syntax and structure of RAM policies, see <a href="https://help.aliyun.com/document_detail/93739.html">Policy syntax and structure</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
     */
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
