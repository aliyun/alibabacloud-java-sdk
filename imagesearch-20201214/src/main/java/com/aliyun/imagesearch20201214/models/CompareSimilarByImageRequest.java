// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class CompareSimilarByImageRequest extends TeaModel {
    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the &lt;props=&quot;intl&quot;&gt;<a href="https://imagesearch.console.alibabacloud.com">Image Search console</a>&lt;props=&quot;china&quot;&gt;<a href="https://imagesearch.console.aliyun.com">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, refer to <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Make sure you distinguish between them.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The image content.</p>
     * <ul>
     * <li>The image size must not exceed 4 MB.</li>
     * <li>Image formats: PNG, JPG, JPEG, BMP, GIF, WEBP, TIFF, and PPM.</li>
     * <li>The transmission wait time must not exceed 5 seconds.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>If the service type is product image search, generic image search, furniture image search, or industrial hardware image search, the image width and height must be at least 100 px and at most 4096 px.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If the service type is trademark image search, the image width and height must be at least 200 px and less than 4096 px.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If the service type is fabric image search, the image width and height must be at least 448 px and at most 4096 px.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>If the service type is product image search or generic image search, the image width and height must be at least 100 px and at most 4096 px.</p>
     * </li>
     * <li><p>The image must not contain rotation information.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><strong>When calling by using an SDK:</strong>- Only V3 SDKs are supported. You do not need to set the PrimaryPicContent field. The SDK encapsulates this field as PrimaryPicContentObject and automatically converts it to Base64 encoding. For examples, refer to <a href="https://help.aliyun.com/document_detail/179188.html">JAVA SDK</a>.- The SDK does not support passing image URLs directly. V3 SDKs provide an alternative way to upload images by URL. For examples, refer to <a href="https://help.aliyun.com/document_detail/179188.html">JAVA SDK</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("PrimaryPicContent")
    public String primaryPicContent;

    /**
     * <p>The image content.</p>
     * <ul>
     * <li>The image size must not exceed 4 MB.</li>
     * <li>Image formats: PNG, JPG, JPEG, BMP, GIF, WEBP, TIFF, and PPM.</li>
     * <li>The transmission wait time must not exceed 5 seconds.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>If the service type is product image search, generic image search, furniture image search, or industrial hardware image search, the image width and height must be at least 100 px and at most 4096 px.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If the service type is trademark image search, the image width and height must be at least 200 px and less than 4096 px.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If the service type is fabric image search, the image width and height must be at least 448 px and at most 4096 px.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>If the service type is product image search or generic image search, the image width and height must be at least 100 px and at most 4096 px.</p>
     * </li>
     * <li><p>The image must not contain rotation information.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><strong>When calling by using an SDK:</strong>- Only V3 SDKs are supported. You do not need to set the PrimaryPicContent field. The SDK encapsulates this field as PrimaryPicContentObject and automatically converts it to Base64 encoding. For examples, refer to <a href="https://help.aliyun.com/document_detail/179188.html">JAVA SDK</a>.- The SDK does not support passing image URLs directly. V3 SDKs provide an alternative way to upload images by URL. For examples, refer to <a href="https://help.aliyun.com/document_detail/179188.html">JAVA SDK</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("SecondaryPicContent")
    public String secondaryPicContent;

    public static CompareSimilarByImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareSimilarByImageRequest self = new CompareSimilarByImageRequest();
        return TeaModel.build(map, self);
    }

    public CompareSimilarByImageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CompareSimilarByImageRequest setPrimaryPicContent(String primaryPicContent) {
        this.primaryPicContent = primaryPicContent;
        return this;
    }
    public String getPrimaryPicContent() {
        return this.primaryPicContent;
    }

    public CompareSimilarByImageRequest setSecondaryPicContent(String secondaryPicContent) {
        this.secondaryPicContent = secondaryPicContent;
        return this;
    }
    public String getSecondaryPicContent() {
        return this.secondaryPicContent;
    }

}
