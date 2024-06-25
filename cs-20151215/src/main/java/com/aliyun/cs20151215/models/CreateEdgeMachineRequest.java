// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateEdgeMachineRequest extends TeaModel {
    /**
     * <p>The <code>hostname</code> of the cloud-native box.</p>
     * <blockquote>
     * <p> After the cloud-native box is activated, the <code>hostname</code> is automatically modified. The <code>hostname</code> is prefixed with the model and the prefix is followed by a random string.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACK-B-B010-****</p>
     */
    @NameInMap("hostname")
    public String hostname;

    /**
     * <p>The model of the cloud-native box.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACK-V-B010</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The serial number of the cloud-native box.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Q2CB5XZAFBFG****</p>
     */
    @NameInMap("sn")
    public String sn;

    public static CreateEdgeMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeMachineRequest self = new CreateEdgeMachineRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeMachineRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateEdgeMachineRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateEdgeMachineRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
