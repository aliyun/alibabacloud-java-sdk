// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether the instance is a replica.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsReplica")
    public Boolean isReplica;

    /**
     * <p>Specifies whether to fence the service instance. After an instance is fenced, it is no longer managed by the VPC controller and a new instance is created. The fenced instance is reserved for troubleshooting or debugging. Note: You cannot unfence an instance. Valid values:</p>
     * <ul>
     * <li>true: Fences the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Detach")
    public Boolean detach;

    /**
     * <blockquote>
     * <p>This parameter is for an invitational preview. It is not generally available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Hibernate")
    public Boolean hibernate;

    /**
     * <p>Specifies whether to isolate the instance. Valid values:</p>
     * <ul>
     * <li><p>true: The instance is isolated and does not receive traffic.</p>
     * </li>
     * <li><p>false: The instance is not isolated and receives traffic.</p>
     * </li>
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
