// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DownloadCdsFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-643267****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <strong>example:</strong>
     * <p>user****</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>63f3257b68b018170b194d87b875512d108f****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DownloadCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadCdsFileRequest self = new DownloadCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DownloadCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DownloadCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DownloadCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DownloadCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
