// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeConnectorAttributeRequest extends TeaModel {
    @NameInMap("ConnectorName")
    public String connectorName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StepInfo")
    public String stepInfo;

    public static DescribeConnectorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectorAttributeRequest self = new DescribeConnectorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConnectorAttributeRequest setConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }
    public String getConnectorName() {
        return this.connectorName;
    }

    public DescribeConnectorAttributeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeConnectorAttributeRequest setStepInfo(String stepInfo) {
        this.stepInfo = stepInfo;
        return this;
    }
    public String getStepInfo() {
        return this.stepInfo;
    }

}
