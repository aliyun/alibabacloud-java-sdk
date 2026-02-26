// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class KdtreeOption extends TeaModel {
    /**
     * <p>The compression level. Valid values: 0 to 10. A greater value specifies a higher compression ratio and ensures better detail effects.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CompressionLevel")
    public Integer compressionLevel;

    /**
     * <p>The name of the library supported by a k-d tree. Set the value to draco. Default value: draco.</p>
     * 
     * <strong>example:</strong>
     * <p>draco</p>
     */
    @NameInMap("LibraryName")
    public String libraryName;

    /**
     * <p>The number of bits for quantization. Valid values: 0 to 31. A greater value ensures that more details are retained. A value of 0 specifies that vertex compression is not performed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
