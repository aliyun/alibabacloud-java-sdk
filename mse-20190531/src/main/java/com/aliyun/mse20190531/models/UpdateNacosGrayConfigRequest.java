// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosGrayConfigRequest extends TeaModel {
    /**
     * <p>The language in which you want the results to be displayed. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The configuration content.</p>
     * 
     * <strong>example:</strong>
     * <p>asdf</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The data ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The canary release rule. For a beta release, you can specify one or more client IP addresses for this parameter. You must separate multiple IP addresses with commas (,). For a tag-based canary release, the value is in the format of Tag name=Tag value. You must separate multiple tag values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>key=value1,value2</p>
     */
    @NameInMap("GrayRule")
    public String grayRule;

    /**
     * <p>The canary version name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GrayRuleName")
    public String grayRuleName;

    /**
     * <p>The canary version priority.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("GrayRulePriority")
    public Integer grayRulePriority;

    /**
     * <p>The canary release type. Beta release (IP address-based canary release) and tag-based canary release are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tags</p>
     */
    @NameInMap("GrayType")
    public String grayType;

    /**
     * <p>The group name. Default value: DEFAULT_GROUP.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_GROUP</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-st2212****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespace ID. Default value: public.</p>
     * 
     * <strong>example:</strong>
     * <p>6cf708a5-****-89f2-3ba62c5ee9ba</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The operation type. Valid values: Create (create a canary release configuration) and Update (update an existing canary release configuration).</p>
     * 
     * <strong>example:</strong>
     * <p>Create</p>
     */
    @NameInMap("OpType")
    public String opType;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The extended request parameter in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>Specifies whether to stop the canary release.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StopGray")
    public Boolean stopGray;

    public static UpdateNacosGrayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosGrayConfigRequest self = new UpdateNacosGrayConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosGrayConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateNacosGrayConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateNacosGrayConfigRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateNacosGrayConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateNacosGrayConfigRequest setGrayRule(String grayRule) {
        this.grayRule = grayRule;
        return this;
    }
    public String getGrayRule() {
        return this.grayRule;
    }

    public UpdateNacosGrayConfigRequest setGrayRuleName(String grayRuleName) {
        this.grayRuleName = grayRuleName;
        return this;
    }
    public String getGrayRuleName() {
        return this.grayRuleName;
    }

    public UpdateNacosGrayConfigRequest setGrayRulePriority(Integer grayRulePriority) {
        this.grayRulePriority = grayRulePriority;
        return this;
    }
    public Integer getGrayRulePriority() {
        return this.grayRulePriority;
    }

    public UpdateNacosGrayConfigRequest setGrayType(String grayType) {
        this.grayType = grayType;
        return this;
    }
    public String getGrayType() {
        return this.grayType;
    }

    public UpdateNacosGrayConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UpdateNacosGrayConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNacosGrayConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNacosGrayConfigRequest setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public UpdateNacosGrayConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateNacosGrayConfigRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public UpdateNacosGrayConfigRequest setStopGray(Boolean stopGray) {
        this.stopGray = stopGray;
        return this;
    }
    public Boolean getStopGray() {
        return this.stopGray;
    }

}
