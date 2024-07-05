// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class KdtreeOption extends TeaModel {
    @NameInMap("CompressionLevel")
    public Integer compressionLevel;

    /**
     * <strong>example:</strong>
     * <p>draco</p>
     */
    @NameInMap("LibraryName")
    public String libraryName;

    @NameInMap("QuantizationBits")
    public Integer quantizationBits;

    public static KdtreeOption build(java.util.Map<String, ?> map) throws Exception {
        KdtreeOption self = new KdtreeOption();
        return TeaModel.build(map, self);
    }

    public KdtreeOption setCompressionLevel(Integer compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    public Integer getCompressionLevel() {
        return this.compressionLevel;
    }

    public KdtreeOption setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public KdtreeOption setQuantizationBits(Integer quantizationBits) {
        this.quantizationBits = quantizationBits;
        return this;
    }
    public Integer getQuantizationBits() {
        return this.quantizationBits;
    }

}
