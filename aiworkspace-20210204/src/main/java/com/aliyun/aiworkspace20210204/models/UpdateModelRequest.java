// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateModelRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ModelDescription")
    public String modelDescription;

    @NameInMap("ModelDoc")
    public String modelDoc;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("OrderNumber")
    public Long orderNumber;

    @NameInMap("Origin")
    public String origin;

    @NameInMap("Task")
    public String task;

    public static UpdateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelRequest self = new UpdateModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateModelRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateModelRequest setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public UpdateModelRequest setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public UpdateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateModelRequest setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public UpdateModelRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public UpdateModelRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

}
