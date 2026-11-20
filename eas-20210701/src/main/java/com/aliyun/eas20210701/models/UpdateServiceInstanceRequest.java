// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether the current instance is an instance unit.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsReplica")
    public Boolean isReplica;

    /**
     * <p>Specifies whether to isolate the service instance. After an instance is isolated, it is no longer managed by the controller, and a new instance is created. The isolated instance is used to preserve the state or for debugging. Note: An isolated instance cannot be unisolated. Valid values:</p>
     * <ul>
     * <li>true: The instance is isolated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Detach")
    public Boolean detach;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Hibernate")
    public Boolean hibernate;

    /**
     * <p>Specifies whether the instance receives traffic. Valid values:</p>
     * <ul>
     * <li>true: The instance receives traffic.</li>
     * <li>false: The instance does not receive traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Isolate")
    public Boolean isolate;

    public static UpdateServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceRequest self = new UpdateServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceRequest setIsReplica(Boolean isReplica) {
        this.isReplica = isReplica;
        return this;
    }
    public Boolean getIsReplica() {
        return this.isReplica;
    }

    public UpdateServiceInstanceRequest setDetach(Boolean detach) {
        this.detach = detach;
        return this;
    }
    public Boolean getDetach() {
        return this.detach;
    }

    public UpdateServiceInstanceRequest setHibernate(Boolean hibernate) {
        this.hibernate = hibernate;
        return this;
    }
    public Boolean getHibernate() {
        return this.hibernate;
    }

    public UpdateServiceInstanceRequest setIsolate(Boolean isolate) {
        this.isolate = isolate;
        return this;
    }
    public Boolean getIsolate() {
        return this.isolate;
    }

}
