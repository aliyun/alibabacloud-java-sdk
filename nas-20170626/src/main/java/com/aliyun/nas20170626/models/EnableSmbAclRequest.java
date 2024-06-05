// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableSmbAclRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The string that is generated after the system encodes the keytab file by using Base64.</p>
     */
    @NameInMap("Keytab")
    public String keytab;

    /**
     * <p>The string that is generated after the system encodes the keytab file by using MD5.</p>
     */
    @NameInMap("KeytabMd5")
    public String keytabMd5;

    public static EnableSmbAclRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSmbAclRequest self = new EnableSmbAclRequest();
        return TeaModel.build(map, self);
    }

    public EnableSmbAclRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public EnableSmbAclRequest setKeytab(String keytab) {
        this.keytab = keytab;
        return this;
    }
    public String getKeytab() {
        return this.keytab;
    }

    public EnableSmbAclRequest setKeytabMd5(String keytabMd5) {
        this.keytabMd5 = keytabMd5;
        return this;
    }
    public String getKeytabMd5() {
        return this.keytabMd5;
    }

}
