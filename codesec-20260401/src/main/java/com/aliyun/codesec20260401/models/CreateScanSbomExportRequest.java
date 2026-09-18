// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateScanSbomExportRequest extends TeaModel {
    /**
     * <p>选填。指定下载落盘的文件名（含扩展名），会签进下载地址的 Content-Disposition。
     * 留空时后端按 <code>项目名-sbom-&lt;format&gt;.&lt;扩展名&gt;</code> 生成默认值。
     * 不得含控制字符或路径分隔符（<code>/</code>、<code>\</code>）、长度不超过 255，否则 → 400 <strong><code>InvalidFileName</code></strong>。</p>
     * 
     * <strong>example:</strong>
     * <p>test-sbom-cyclonedx.cdx.json</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>闭合枚举，须是该次扫描 <strong><code>artifacts</code></strong> 里 <strong><code>status=success</code></strong> 的 <strong><code>artifact_kind</code></strong>。
     * 未知值 → 400 <strong><code>InvalidArtifactFormat</code></strong>，且绝不参与 OSS key 构造。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cyclonedx-json</p>
     */
    @NameInMap("format")
    public String format;

    public static CreateScanSbomExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScanSbomExportRequest self = new CreateScanSbomExportRequest();
        return TeaModel.build(map, self);
    }

    public CreateScanSbomExportRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateScanSbomExportRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

}
