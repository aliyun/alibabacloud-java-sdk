// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ImportDefinitionAsynchronousRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImportType")
    public Integer importType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    @NameInMap("VhostName")
    public String vhostName;

    public static ImportDefinitionAsynchronousRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDefinitionAsynchronousRequest self = new ImportDefinitionAsynchronousRequest();
        return TeaModel.build(map, self);
    }

    public ImportDefinitionAsynchronousRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public ImportDefinitionAsynchronousRequest setImportType(Integer importType) {
        this.importType = importType;
        return this;
    }
    public Integer getImportType() {
        return this.importType;
    }

    public ImportDefinitionAsynchronousRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportDefinitionAsynchronousRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ImportDefinitionAsynchronousRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public ImportDefinitionAsynchronousRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
