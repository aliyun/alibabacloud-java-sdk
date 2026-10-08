// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryArtExtensionResponseBody extends TeaModel {
    /**
     * <p>Creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-01</p>
     */
    @NameInMap("DateOrPeriod")
    public String dateOrPeriod;

    /**
     * <p>Dimensions.</p>
     * 
     * <strong>example:</strong>
     * <p>20 cm</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>Art features.</p>
     * 
     * <strong>example:</strong>
     * <p>iconicity</p>
     */
    @NameInMap("Features")
    public String features;

    /**
     * <p>Inscriptions and markings.</p>
     * 
     * <strong>example:</strong>
     * <p>realism</p>
     */
    @NameInMap("InscriptionsAndMarkings")
    public String inscriptionsAndMarkings;

    /**
     * <p>Artist or creator.</p>
     * 
     * <strong>example:</strong>
     * <p>zhang san</p>
     */
    @NameInMap("Maker")
    public String maker;

    /**
     * <p>Materials and techniques.</p>
     * 
     * <strong>example:</strong>
     * <p>silk</p>
     */
    @NameInMap("MaterialsAndTechniques")
    public String materialsAndTechniques;

    /**
     * <p>Art categorization.</p>
     * 
     * <strong>example:</strong>
     * <p>The embroidery</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>Reference.</p>
     * 
     * <strong>example:</strong>
     * <p>drawings</p>
     */
    @NameInMap("Reference")
    public String reference;

    /**
     * <p>Unique request access token.</p>
     * 
     * <strong>example:</strong>
     * <p>814B2AF0-ED6F-4C13-B41C-8AC0B1023583</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Art subject.</p>
     * 
     * <strong>example:</strong>
     * <p>peace</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>Name.</p>
     * 
     * <strong>example:</strong>
     * <p>Peace and friendship</p>
     */
    @NameInMap("Title")
    public String title;

    public static QueryArtExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryArtExtensionResponseBody self = new QueryArtExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryArtExtensionResponseBody setDateOrPeriod(String dateOrPeriod) {
        this.dateOrPeriod = dateOrPeriod;
        return this;
    }
    public String getDateOrPeriod() {
        return this.dateOrPeriod;
    }

    public QueryArtExtensionResponseBody setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public QueryArtExtensionResponseBody setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public QueryArtExtensionResponseBody setInscriptionsAndMarkings(String inscriptionsAndMarkings) {
        this.inscriptionsAndMarkings = inscriptionsAndMarkings;
        return this;
    }
    public String getInscriptionsAndMarkings() {
        return this.inscriptionsAndMarkings;
    }

    public QueryArtExtensionResponseBody setMaker(String maker) {
        this.maker = maker;
        return this;
    }
    public String getMaker() {
        return this.maker;
    }

    public QueryArtExtensionResponseBody setMaterialsAndTechniques(String materialsAndTechniques) {
        this.materialsAndTechniques = materialsAndTechniques;
        return this;
    }
    public String getMaterialsAndTechniques() {
        return this.materialsAndTechniques;
    }

    public QueryArtExtensionResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public QueryArtExtensionResponseBody setReference(String reference) {
        this.reference = reference;
        return this;
    }
    public String getReference() {
        return this.reference;
    }

    public QueryArtExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryArtExtensionResponseBody setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public QueryArtExtensionResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
