// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasFunctionPluginFieldDataDTO extends TeaModel {
    // Function
    @NameInMap("Function")
    public String function;

    // AliyunFunction
    @NameInMap("AliyunFunction")
    public String aliyunFunction;

    // Type
    @NameInMap("Type")
    public String type;

    // Description
    @NameInMap("Description")
    public String description;

    // EndPoint
    @NameInMap("EndPoint")
    public String endPoint;

    // Code
    @NameInMap("Code")
    public String code;

    // Name
    @NameInMap("Name")
    public String name;

    // AliyunService
    @NameInMap("AliyunService")
    public String aliyunService;

    // Switch
    @NameInMap("Switch")
    public java.util.List<PaasSwitchCaseDTO> _switch;

    // Params
    @NameInMap("Params")
    public java.util.Map<String, ?> params;

    public static PaasFunctionPluginFieldDataDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasFunctionPluginFieldDataDTO self = new PaasFunctionPluginFieldDataDTO();
        return TeaModel.build(map, self);
    }

    public PaasFunctionPluginFieldDataDTO setFunction(String function) {
        this.function = function;
        return this;
    }
    public String getFunction() {
        return this.function;
    }

    public PaasFunctionPluginFieldDataDTO setAliyunFunction(String aliyunFunction) {
        this.aliyunFunction = aliyunFunction;
        return this;
    }
    public String getAliyunFunction() {
        return this.aliyunFunction;
    }

    public PaasFunctionPluginFieldDataDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PaasFunctionPluginFieldDataDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PaasFunctionPluginFieldDataDTO setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

    public PaasFunctionPluginFieldDataDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PaasFunctionPluginFieldDataDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PaasFunctionPluginFieldDataDTO setAliyunService(String aliyunService) {
        this.aliyunService = aliyunService;
        return this;
    }
    public String getAliyunService() {
        return this.aliyunService;
    }

    public PaasFunctionPluginFieldDataDTO set_switch(java.util.List<PaasSwitchCaseDTO> _switch) {
        this._switch = _switch;
        return this;
    }
    public java.util.List<PaasSwitchCaseDTO> get_switch() {
        return this._switch;
    }

    public PaasFunctionPluginFieldDataDTO setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

}
