// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesRequest extends TeaModel {
    /**
     * <p>The name of the container in which to restart the process. This parameter is valid only when \<code>SoftRestart\\</code> is set to \<code>true\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>worker0</p>
     */
    @NameInMap("Container")
    public String container;

    /**
     * <p>The instances to restart. Separate multiple instance names with a comma (,). For more information, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>foo-rdsbxxxx,foo-rdsaxxxx</p>
     */
    @NameInMap("InstanceList")
    public String instanceList;

    /**
     * <p>Specifies whether the instance is a replica.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsReplica")
    public Boolean isReplica;

    /**
     * <p>Specifies whether to restart only the container process without rebuilding the instance. The default value is false.</p>
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
