// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesRequest extends TeaModel {
    /**
     * <p>The name of the container whose process needs to be restarted. This parameter takes effect only if the SoftRestart parameter is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>worker0</p>
     */
    @NameInMap("Container")
    public String container;

    /**
     * <p>The instances that you want to restart. Separate multiple instance names with commas (,). For more information about how to query the instance name, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>foo-rdsbxxxx,foo-rdsaxxxx</p>
     */
    @NameInMap("InstanceList")
    public String instanceList;

    @NameInMap("IsReplica")
    public Boolean isReplica;

    /**
     * <p>Specifies whether to restart only the container process without recreating the instance. Default value: false. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SoftRestart")
    public Boolean softRestart;

    public static DeleteServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceInstancesRequest self = new DeleteServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceInstancesRequest setContainer(String container) {
        this.container = container;
        return this;
    }
    public String getContainer() {
        return this.container;
    }

    public DeleteServiceInstancesRequest setInstanceList(String instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public String getInstanceList() {
        return this.instanceList;
    }

    public DeleteServiceInstancesRequest setIsReplica(Boolean isReplica) {
        this.isReplica = isReplica;
        return this;
    }
    public Boolean getIsReplica() {
        return this.isReplica;
    }

    public DeleteServiceInstancesRequest setSoftRestart(Boolean softRestart) {
        this.softRestart = softRestart;
        return this;
    }
    public Boolean getSoftRestart() {
        return this.softRestart;
    }

}
