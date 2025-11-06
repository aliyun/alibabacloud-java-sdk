// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceRequest extends TeaModel {
    @NameInMap("IsReplica")
    public Boolean isReplica;

    @NameInMap("Detach")
    public Boolean detach;

    @NameInMap("Hibernate")
    public Boolean hibernate;

    /**
     * <p>Specifies whether to isolate the service instance. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
