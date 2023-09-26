// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateCustomizedInfoRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("CsharpDemo")
    public String csharpDemo;

    @NameInMap("CurlDemo")
    public String curlDemo;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JavaDemo")
    public String javaDemo;

    @NameInMap("ObjectcDemo")
    public String objectcDemo;

    @NameInMap("PhpDemo")
    public String phpDemo;

    @NameInMap("PythonDemo")
    public String pythonDemo;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("StageName")
    public String stageName;

    public static CreateCustomizedInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedInfoRequest self = new CreateCustomizedInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedInfoRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public CreateCustomizedInfoRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateCustomizedInfoRequest setCsharpDemo(String csharpDemo) {
        this.csharpDemo = csharpDemo;
        return this;
    }
    public String getCsharpDemo() {
        return this.csharpDemo;
    }

    public CreateCustomizedInfoRequest setCurlDemo(String curlDemo) {
        this.curlDemo = curlDemo;
        return this;
    }
    public String getCurlDemo() {
        return this.curlDemo;
    }

    public CreateCustomizedInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateCustomizedInfoRequest setJavaDemo(String javaDemo) {
        this.javaDemo = javaDemo;
        return this;
    }
    public String getJavaDemo() {
        return this.javaDemo;
    }

    public CreateCustomizedInfoRequest setObjectcDemo(String objectcDemo) {
        this.objectcDemo = objectcDemo;
        return this;
    }
    public String getObjectcDemo() {
        return this.objectcDemo;
    }

    public CreateCustomizedInfoRequest setPhpDemo(String phpDemo) {
        this.phpDemo = phpDemo;
        return this;
    }
    public String getPhpDemo() {
        return this.phpDemo;
    }

    public CreateCustomizedInfoRequest setPythonDemo(String pythonDemo) {
        this.pythonDemo = pythonDemo;
        return this;
    }
    public String getPythonDemo() {
        return this.pythonDemo;
    }

    public CreateCustomizedInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateCustomizedInfoRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public CreateCustomizedInfoRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
