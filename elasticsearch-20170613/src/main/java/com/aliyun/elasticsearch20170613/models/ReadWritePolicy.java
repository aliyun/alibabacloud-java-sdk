// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ReadWritePolicy extends TeaModel {
    /**
     * <p>Specifies whether to automatically generate a document hash primary key when no primary key exists. Valid values:</p>
     * <ul>
     * <li>true (default): automatically generates a primary key.</li>
     * <li>false: does not automatically generate a primary key.</li>
     * </ul>
     * <blockquote>
     * <p>Notice:  autoGeneratePk cannot be modified independently. The autoGeneratePk setting takes effect only when writeHa is changed from false to true.
     * .</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoGeneratePk")
    public Boolean autoGeneratePk;

    /**
     * <p>Specifies whether to enable the write high-availability feature. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("writeHa")
    public Boolean writeHa;

    /**
     * <p>Temporarily switches between synchronous and asynchronous high availability. Valid values:</p>
     * <ul>
     * <li>sync: temporarily switches from asynchronous write high availability to synchronous write.</li>
     * <li>async: restores asynchronous write high availability after synchronous write is temporarily enabled.</li>
     * </ul>
     * <blockquote>
     * <p>This field takes effect only when high availability is enabled, that is, writeHa is set to true. You do not need to pass in the writeHa field when setting this field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sync</p>
     */
    @NameInMap("writePolicy")
    public String writePolicy;

    public static ReadWritePolicy build(java.util.Map<String, ?> map) throws Exception {
        ReadWritePolicy self = new ReadWritePolicy();
        return TeaModel.build(map, self);
    }

    public ReadWritePolicy setAutoGeneratePk(Boolean autoGeneratePk) {
        this.autoGeneratePk = autoGeneratePk;
        return this;
    }
    public Boolean getAutoGeneratePk() {
        return this.autoGeneratePk;
    }

    public ReadWritePolicy setWriteHa(Boolean writeHa) {
        this.writeHa = writeHa;
        return this;
    }
    public Boolean getWriteHa() {
        return this.writeHa;
    }

    public ReadWritePolicy setWritePolicy(String writePolicy) {
        this.writePolicy = writePolicy;
        return this;
    }
    public String getWritePolicy() {
        return this.writePolicy;
    }

}
