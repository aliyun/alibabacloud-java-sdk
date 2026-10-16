// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateScanSbomExportRequest extends TeaModel {
    /**
     * <p>The file name (including the extension) for the downloaded file. The file name is signed into the Content-Disposition header of the URL. If you leave this parameter empty, the backend generates a file name in the format of project name-sbom-<format>.<extension>. If the file name contains control characters or path separators (/ or \), or if the length exceeds 255 characters, a 400 InvalidFileName error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test-sbom-cyclonedx.cdx.json</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>Valid values:</p>
     * <ul>
     * <li>cyclonedx-json</li>
     * <li>spdx-json</li>
     * </ul>
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
