// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class OperationModelFileAction extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("action")
    public String action;

    @NameInMap("destination")
    public String destination;

    @NameInMap("source")
    public String source;

    @NameInMap("target")
    public String target;

    public static OperationModelFileAction build(java.util.Map<String, ?> map) throws Exception {
        OperationModelFileAction self = new OperationModelFileAction();
        return TeaModel.build(map, self);
    }

    public OperationModelFileAction setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public OperationModelFileAction setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public OperationModelFileAction setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public OperationModelFileAction setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
