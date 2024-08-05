// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DryRunSwaggerShrinkRequest extends TeaModel {
    /**
     * <p>The Swagger text content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;A Swagger API definition in YAML&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The Swagger text format:</p>
     * <ul>
     * <li>json</li>
     * <li>yaml</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yaml</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>The global condition.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("GlobalCondition")
    public String globalConditionShrink;

    /**
     * <p>The ID of the API group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d633cf5524f841b9950e245b191bdabf</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to overwrite the existing API.</p>
     * <p>APIs with the same HTTP request type and backend request path are considered the same.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DryRunSwaggerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DryRunSwaggerShrinkRequest self = new DryRunSwaggerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DryRunSwaggerShrinkRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DryRunSwaggerShrinkRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DryRunSwaggerShrinkRequest setGlobalConditionShrink(String globalConditionShrink) {
        this.globalConditionShrink = globalConditionShrink;
        return this;
    }
    public String getGlobalConditionShrink() {
        return this.globalConditionShrink;
    }

    public DryRunSwaggerShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DryRunSwaggerShrinkRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public DryRunSwaggerShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
